package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Payment28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Payment28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.25f, 16.5f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            reflectiveCurveTo(17.836f, 18f, 18.25f, 18f)
            horizontalLineToRelative(3.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineToRelative(-3.5f)
            close()
            moveTo(2.004f, 8.75f)
            curveTo(2.004f, 6.679f, 3.683f, 5f, 5.754f, 5f)
            horizontalLineTo(22.25f)
            curveTo(24.32f, 5f, 26f, 6.679f, 26f, 8.75f)
            verticalLineToRelative(10.5f)
            curveToRelative(0f, 2.071f, -1.68f, 3.75f, -3.75f, 3.75f)
            horizontalLineTo(5.753f)
            curveToRelative(-2.071f, 0f, -3.75f, -1.679f, -3.75f, -3.75f)
            verticalLineTo(8.75f)
            close()
            moveToRelative(3.75f, -2.25f)
            curveToRelative(-1.243f, 0f, -2.25f, 1.007f, -2.25f, 2.25f)
            verticalLineTo(9.5f)
            horizontalLineTo(24.5f)
            verticalLineTo(8.75f)
            curveToRelative(0f, -1.243f, -1.008f, -2.25f, -2.25f, -2.25f)
            horizontalLineTo(5.753f)
            close()
            moveToRelative(-2.25f, 12.75f)
            curveToRelative(0f, 1.243f, 1.007f, 2.25f, 2.25f, 2.25f)
            horizontalLineTo(22.25f)
            curveToRelative(1.242f, 0f, 2.25f, -1.007f, 2.25f, -2.25f)
            verticalLineTo(11f)
            horizontalLineTo(3.503f)
            verticalLineToRelative(8.25f)
            close()
        }
    }.build()
}
