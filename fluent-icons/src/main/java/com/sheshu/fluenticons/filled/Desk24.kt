package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Desk24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Desk24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.25f, 4f)
            curveTo(3.007f, 4f, 2f, 5.007f, 2f, 6.25f)
            verticalLineTo(8f)
            horizontalLineToRelative(18.5f)
            verticalLineToRelative(11.25f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveTo(22f, 19.664f, 22f, 19.25f)
            verticalLineToRelative(-13f)
            curveTo(22f, 5.007f, 20.993f, 4f, 19.75f, 4f)
            horizontalLineTo(4.25f)
            close()
            moveTo(12f, 9.5f)
            horizontalLineTo(2f)
            verticalLineToRelative(7.75f)
            curveTo(2f, 18.769f, 3.231f, 20f, 4.75f, 20f)
            horizontalLineToRelative(4.5f)
            curveToRelative(1.519f, 0f, 2.75f, -1.231f, 2.75f, -2.75f)
            verticalLineTo(9.5f)
            close()
            moveToRelative(-7f, 3.25f)
            curveTo(5f, 12.336f, 5.336f, 12f, 5.75f, 12f)
            horizontalLineToRelative(2.5f)
            curveTo(8.664f, 12f, 9f, 12.336f, 9f, 12.75f)
            reflectiveCurveTo(8.664f, 13.5f, 8.25f, 13.5f)
            horizontalLineToRelative(-2.5f)
            curveTo(5.336f, 13.5f, 5f, 13.164f, 5f, 12.75f)
            close()
        }
    }.build()
}
