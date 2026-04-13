package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.SquareArrowForward32: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SquareArrowForward32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 7.5f)
            curveTo(3f, 5.015f, 5.015f, 3f, 7.5f, 3f)
            horizontalLineToRelative(17f)
            curveTo(26.985f, 3f, 29f, 5.015f, 29f, 7.5f)
            verticalLineToRelative(8.775f)
            curveToRelative(-0.587f, -0.613f, -1.26f, -1.143f, -2f, -1.571f)
            verticalLineTo(7.5f)
            curveTo(27f, 6.12f, 25.88f, 5f, 24.5f, 5f)
            horizontalLineToRelative(-17f)
            curveTo(6.12f, 5f, 5f, 6.12f, 5f, 7.5f)
            verticalLineToRelative(17f)
            curveTo(5f, 25.88f, 6.12f, 27f, 7.5f, 27f)
            horizontalLineToRelative(7.204f)
            curveToRelative(0.428f, 0.74f, 0.958f, 1.413f, 1.571f, 2f)
            horizontalLineTo(7.5f)
            curveTo(5.015f, 29f, 3f, 26.985f, 3f, 24.5f)
            verticalLineToRelative(-17f)
            close()
            moveToRelative(27f, 15f)
            curveToRelative(0f, 4.142f, -3.358f, 7.5f, -7.5f, 7.5f)
            curveToRelative(-4.142f, 0f, -7.5f, -3.358f, -7.5f, -7.5f)
            curveToRelative(0f, -4.142f, 3.358f, -7.5f, 7.5f, -7.5f)
            curveToRelative(4.142f, 0f, 7.5f, 3.358f, 7.5f, 7.5f)
            close()
            moveToRelative(-4.72f, -3.78f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineTo(25.44f, 21f)
            horizontalLineTo(22.5f)
            curveToRelative(-2.347f, 0f, -4.25f, 1.903f, -4.25f, 4.25f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -1.519f, 1.231f, -2.75f, 2.75f, -2.75f)
            horizontalLineToRelative(2.94f)
            lineToRelative(-1.22f, 1.22f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineToRelative(2.5f, -2.5f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(-2.5f, -2.5f)
            close()
        }
    }.build()
}
