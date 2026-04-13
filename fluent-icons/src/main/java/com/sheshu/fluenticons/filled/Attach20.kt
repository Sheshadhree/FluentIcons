package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Attach20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Attach20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.28f, 10.609f)
            lineToRelative(5.304f, -5.303f)
            curveToRelative(1.074f, -1.075f, 2.815f, -1.075f, 3.889f, 0f)
            curveToRelative(1.074f, 1.073f, 1.074f, 2.815f, 0f, 3.888f)
            lineToRelative(-6.364f, 6.364f)
            curveToRelative(-0.488f, 0.489f, -1.28f, 0.489f, -1.768f, 0f)
            curveToRelative(-0.488f, -0.488f, -0.488f, -1.28f, 0f, -1.767f)
            lineToRelative(5.657f, -5.657f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.768f, 0f, -1.06f)
            curveToRelative(-0.293f, -0.294f, -0.768f, -0.294f, -1.06f, 0f)
            lineTo(5.28f, 12.73f)
            curveToRelative(-1.074f, 1.074f, -1.074f, 2.815f, 0f, 3.89f)
            curveToRelative(1.074f, 1.073f, 2.815f, 1.073f, 3.89f, 0f)
            lineToRelative(6.363f, -6.365f)
            curveToRelative(1.66f, -1.66f, 1.66f, -4.35f, 0f, -6.01f)
            curveToRelative(-1.66f, -1.66f, -4.35f, -1.66f, -6.01f, 0f)
            lineTo(4.22f, 9.548f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.768f, 0f, 1.06f)
            curveToRelative(0.293f, 0.294f, 0.767f, 0.294f, 1.06f, 0f)
            close()
        }
    }.build()
}
