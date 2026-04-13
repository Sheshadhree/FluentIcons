package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.StarThreeQuarter28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.StarThreeQuarter28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17f, 7.349f)
            lineToRelative(-1.698f, -3.441f)
            curveToRelative(-0.532f, -1.078f, -2.069f, -1.078f, -2.6f, 0f)
            lineTo(10.01f, 9.36f)
            lineToRelative(-6.017f, 0.875f)
            curveToRelative(-1.19f, 0.173f, -1.664f, 1.634f, -0.804f, 2.473f)
            lineToRelative(4.355f, 4.244f)
            lineToRelative(-1.028f, 5.993f)
            curveToRelative(-0.204f, 1.185f, 1.04f, 2.088f, 2.104f, 1.529f)
            lineToRelative(5.382f, -2.83f)
            lineTo(17f, 23.221f)
            verticalLineTo(7.349f)
            close()
        }
    }.build()
}
