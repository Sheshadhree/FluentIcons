package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowCounterclockwise20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowCounterclockwise20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 10f)
            curveToRelative(0f, -3.314f, -2.686f, -6f, -6f, -6f)
            curveToRelative(-1.521f, 0f, -2.91f, 0.566f, -3.969f, 1.5f)
            horizontalLineTo(7.25f)
            curveTo(7.664f, 5.5f, 8f, 5.836f, 8f, 6.25f)
            reflectiveCurveTo(7.664f, 7f, 7.25f, 7f)
            horizontalLineToRelative(-3f)
            curveTo(3.836f, 7f, 3.5f, 6.664f, 3.5f, 6.25f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            reflectiveCurveTo(5f, 2.836f, 5f, 3.25f)
            verticalLineToRelative(1.16f)
            curveTo(6.326f, 3.223f, 8.079f, 2.5f, 10f, 2.5f)
            curveToRelative(4.142f, 0f, 7.5f, 3.358f, 7.5f, 7.5f)
            curveToRelative(0f, 4.142f, -3.358f, 7.5f, -7.5f, 7.5f)
            curveToRelative(-4.142f, 0f, -7.5f, -3.358f, -7.5f, -7.5f)
            curveToRelative(0f, -0.093f, 0.002f, -0.185f, 0.005f, -0.277f)
            curveTo(2.52f, 9.309f, 2.868f, 8.985f, 3.282f, 9f)
            curveToRelative(0.414f, 0.015f, 0.737f, 0.363f, 0.722f, 0.777f)
            curveTo(4.001f, 9.851f, 4f, 9.925f, 4f, 10f)
            curveToRelative(0f, 3.314f, 2.686f, 6f, 6f, 6f)
            reflectiveCurveToRelative(6f, -2.686f, 6f, -6f)
            close()
        }
    }.build()
}
