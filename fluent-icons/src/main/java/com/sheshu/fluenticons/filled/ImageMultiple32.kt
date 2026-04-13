package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ImageMultiple32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ImageMultiple32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7f, 3f)
            curveTo(4.79f, 3f, 3f, 4.79f, 3f, 7f)
            verticalLineToRelative(14f)
            curveToRelative(0f, 0.745f, 0.204f, 1.443f, 0.559f, 2.04f)
            lineToRelative(8.834f, -8.392f)
            curveToRelative(0.9f, -0.856f, 2.313f, -0.856f, 3.214f, 0f)
            lineToRelative(8.834f, 8.392f)
            curveTo(24.796f, 22.443f, 25f, 21.745f, 25f, 21f)
            verticalLineTo(7f)
            curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
            horizontalLineTo(7f)
            close()
            moveToRelative(16.023f, 21.451f)
            lineToRelative(-8.793f, -8.354f)
            curveToRelative(-0.13f, -0.122f, -0.33f, -0.122f, -0.46f, 0f)
            lineToRelative(-8.793f, 8.354f)
            curveTo(5.57f, 24.8f, 6.262f, 25f, 7f, 25f)
            horizontalLineToRelative(14f)
            curveToRelative(0.738f, 0f, 1.43f, -0.2f, 2.023f, -0.549f)
            close()
            moveTo(20f, 10.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveTo(17f, 11.328f, 17f, 10.5f)
            reflectiveCurveTo(17.672f, 9f, 18.5f, 9f)
            reflectiveCurveTo(20f, 9.672f, 20f, 10.5f)
            close()
            moveToRelative(-9.5f, 18f)
            curveToRelative(-1.48f, 0f, -2.773f, -0.804f, -3.465f, -2f)
            horizontalLineTo(21f)
            curveToRelative(3.038f, 0f, 5.5f, -2.462f, 5.5f, -5.5f)
            verticalLineTo(7.035f)
            curveToRelative(1.196f, 0.692f, 2f, 1.984f, 2f, 3.465f)
            verticalLineTo(21f)
            curveToRelative(0f, 4.142f, -3.358f, 7.5f, -7.5f, 7.5f)
            horizontalLineTo(10.5f)
            close()
        }
    }.build()
}
