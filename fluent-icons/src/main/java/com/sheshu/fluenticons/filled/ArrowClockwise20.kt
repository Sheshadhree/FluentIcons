package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowClockwise20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowClockwise20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 10f)
            curveToRelative(0f, -3.314f, 2.686f, -6f, 6f, -6f)
            curveToRelative(1.521f, 0f, 2.91f, 0.566f, 3.969f, 1.5f)
            horizontalLineTo(12.75f)
            curveTo(12.336f, 5.5f, 12f, 5.836f, 12f, 6.25f)
            reflectiveCurveTo(12.336f, 7f, 12.75f, 7f)
            horizontalLineToRelative(3f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            reflectiveCurveTo(15f, 2.836f, 15f, 3.25f)
            verticalLineToRelative(1.16f)
            curveToRelative(-1.326f, -1.187f, -3.079f, -1.91f, -5f, -1.91f)
            curveToRelative(-4.142f, 0f, -7.5f, 3.358f, -7.5f, 7.5f)
            curveToRelative(0f, 4.142f, 3.358f, 7.5f, 7.5f, 7.5f)
            curveToRelative(4.142f, 0f, 7.5f, -3.358f, 7.5f, -7.5f)
            curveToRelative(0f, -0.093f, -0.002f, -0.185f, -0.005f, -0.277f)
            curveTo(17.48f, 9.309f, 17.132f, 8.985f, 16.718f, 9f)
            curveToRelative(-0.414f, 0.015f, -0.737f, 0.363f, -0.722f, 0.777f)
            curveTo(15.999f, 9.851f, 16f, 9.925f, 16f, 10f)
            curveToRelative(0f, 3.314f, -2.686f, 6f, -6f, 6f)
            reflectiveCurveToRelative(-6f, -2.686f, -6f, -6f)
            close()
        }
    }.build()
}
