package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Pentagon20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Pentagon20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.761f, 1.658f)
            curveTo(10.81f, 0.785f, 9.35f, 0.78f, 8.391f, 1.648f)
            lineTo(2.822f, 6.7f)
            curveTo(2.07f, 7.381f, 1.804f, 8.448f, 2.149f, 9.402f)
            lineToRelative(2.149f, 5.947f)
            curveToRelative(0.358f, 0.99f, 1.298f, 1.65f, 2.351f, 1.65f)
            horizontalLineToRelative(6.827f)
            curveToRelative(1.073f, 0f, 2.026f, -0.685f, 2.369f, -1.702f)
            lineTo(17.87f, 9.28f)
            curveToRelative(0.316f, -0.937f, 0.05f, -1.972f, -0.68f, -2.64f)
            lineToRelative(-5.43f, -4.981f)
            close()
        }
    }.build()
}
