package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.StarOff28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.StarOff28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.28f, 2.22f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(6.297f, 6.298f)
            lineToRelative(-4.526f, 0.657f)
            curveToRelative(-1.19f, 0.173f, -1.664f, 1.635f, -0.804f, 2.473f)
            lineToRelative(4.355f, 4.245f)
            lineToRelative(-1.028f, 5.992f)
            curveToRelative(-0.203f, 1.185f, 1.04f, 2.088f, 2.104f, 1.53f)
            lineTo(14f, 21.644f)
            lineToRelative(5.382f, 2.83f)
            curveToRelative(1.063f, 0.558f, 2.307f, -0.345f, 2.103f, -1.53f)
            lineToRelative(-0.082f, -0.481f)
            lineToRelative(3.316f, 3.317f)
            curveToRelative(0.293f, 0.292f, 0.768f, 0.292f, 1.061f, 0f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.768f, 0f, -1.061f)
            lineTo(3.28f, 2.22f)
            close()
            moveToRelative(7.566f, 5.444f)
            lineToRelative(9.679f, 9.68f)
            lineToRelative(-0.067f, -0.391f)
            lineToRelative(4.354f, -4.245f)
            curveToRelative(0.86f, -0.838f, 0.385f, -2.3f, -0.804f, -2.473f)
            lineToRelative(-6.017f, -0.874f)
            lineTo(15.3f, 3.908f)
            curveToRelative(-0.532f, -1.077f, -2.069f, -1.077f, -2.6f, 0f)
            lineToRelative(-1.854f, 3.756f)
            close()
        }
    }.build()
}
