package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.StarThreeQuarter20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.StarThreeQuarter20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 5.133f)
            lineToRelative(-1.102f, -2.234f)
            curveToRelative(-0.367f, -0.743f, -1.427f, -0.743f, -1.794f, 0f)
            lineToRelative(-1.93f, 3.912f)
            lineToRelative(-4.317f, 0.627f)
            curveToRelative(-0.82f, 0.12f, -1.147f, 1.127f, -0.554f, 1.706f)
            lineToRelative(3.124f, 3.044f)
            lineToRelative(-0.738f, 4.3f)
            curveToRelative(-0.14f, 0.816f, 0.718f, 1.44f, 1.451f, 1.054f)
            lineToRelative(3.861f, -2.03f)
            lineTo(12f, 16.562f)
            verticalLineTo(5.133f)
            close()
        }
    }.build()
}
