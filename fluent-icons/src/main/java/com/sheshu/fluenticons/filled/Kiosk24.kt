package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Kiosk24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Kiosk24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.25f, 2f)
            curveTo(5.007f, 2f, 4f, 3.007f, 4f, 4.25f)
            verticalLineToRelative(6.5f)
            curveTo(4f, 11.993f, 5.007f, 13f, 6.25f, 13f)
            horizontalLineTo(9.5f)
            verticalLineToRelative(7.5f)
            horizontalLineTo(7.75f)
            curveTo(7.336f, 20.5f, 7f, 20.836f, 7f, 21.25f)
            reflectiveCurveTo(7.336f, 22f, 7.75f, 22f)
            horizontalLineToRelative(8.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineTo(14.5f)
            verticalLineTo(13f)
            horizontalLineToRelative(3.25f)
            curveToRelative(1.243f, 0f, 2.25f, -1.007f, 2.25f, -2.25f)
            verticalLineToRelative(-6.5f)
            curveTo(20f, 3.007f, 18.993f, 2f, 17.75f, 2f)
            horizontalLineTo(6.25f)
            close()
            moveTo(11f, 20.5f)
            verticalLineTo(13f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(7.5f)
            horizontalLineToRelative(-2f)
            close()
        }
    }.build()
}
