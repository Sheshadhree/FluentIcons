package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.SplitVertical24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SplitVertical24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.5f, 2.75f)
            curveTo(12.5f, 2.336f, 12.164f, 2f, 11.75f, 2f)
            reflectiveCurveTo(11f, 2.336f, 11f, 2.75f)
            verticalLineToRelative(18.5f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(2.75f)
            close()
            moveTo(4.25f, 4f)
            curveTo(3.007f, 4f, 2f, 5.007f, 2f, 6.25f)
            verticalLineToRelative(11.5f)
            curveTo(2f, 18.993f, 3.007f, 20f, 4.25f, 20f)
            horizontalLineTo(10f)
            verticalLineToRelative(-1.5f)
            horizontalLineTo(4.25f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineTo(6.25f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineTo(10f)
            verticalLineTo(4f)
            horizontalLineTo(4.25f)
            close()
            moveToRelative(15f, 14.5f)
            horizontalLineTo(13.5f)
            verticalLineTo(20f)
            horizontalLineToRelative(5.75f)
            curveToRelative(1.243f, 0f, 2.25f, -1.007f, 2.25f, -2.25f)
            verticalLineTo(6.25f)
            curveTo(21.5f, 5.007f, 20.493f, 4f, 19.25f, 4f)
            horizontalLineTo(13.5f)
            verticalLineToRelative(1.5f)
            horizontalLineToRelative(5.75f)
            curveTo(19.664f, 5.5f, 20f, 5.836f, 20f, 6.25f)
            verticalLineToRelative(11.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            close()
        }
    }.build()
}
