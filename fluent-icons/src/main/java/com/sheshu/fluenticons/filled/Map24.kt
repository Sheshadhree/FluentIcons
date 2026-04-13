package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Map24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Map24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.5f, 4.358f)
            verticalLineToRelative(12.465f)
            lineToRelative(-4.32f, 3.038f)
            curveToRelative(-0.467f, 0.33f, -1.101f, 0.034f, -1.174f, -0.509f)
            lineToRelative(-0.007f, -0.104f)
            verticalLineTo(8.615f)
            curveToRelative(0f, -0.209f, 0.087f, -0.407f, 0.238f, -0.548f)
            lineToRelative(0.08f, -0.065f)
            lineTo(8.5f, 4.358f)
            close()
            moveToRelative(12.494f, 0.29f)
            lineToRelative(0.007f, 0.104f)
            verticalLineToRelative(10.633f)
            curveToRelative(0f, 0.21f, -0.087f, 0.407f, -0.238f, 0.548f)
            lineToRelative(-0.08f, 0.065f)
            lineTo(15.5f, 19.64f)
            verticalLineTo(7.174f)
            lineToRelative(4.32f, -3.035f)
            curveToRelative(0.468f, -0.33f, 1.102f, -0.034f, 1.174f, 0.509f)
            close()
            moveTo(10f, 4.359f)
            lineToRelative(4f, 2.812f)
            verticalLineToRelative(12.467f)
            lineToRelative(-4f, -2.814f)
            verticalLineTo(4.359f)
            close()
        }
    }.build()
}
