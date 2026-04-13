package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Box16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Box16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.036f, 2.488f)
            lineToRelative(6.611f, 2.833f)
            lineTo(8f, 6.454f)
            lineTo(1.427f, 3.638f)
            curveTo(1.575f, 3.487f, 1.756f, 3.365f, 1.96f, 3.286f)
            lineToRelative(2.075f, -0.798f)
            close()
            moveToRelative(1.338f, -0.514f)
            lineToRelative(1.55f, -0.596f)
            curveToRelative(0.692f, -0.267f, 1.46f, -0.267f, 2.153f, 0f)
            lineToRelative(4.962f, 1.908f)
            curveToRelative(0.205f, 0.08f, 0.386f, 0.2f, 0.534f, 0.352f)
            lineToRelative(-2.656f, 1.139f)
            lineToRelative(-6.543f, -2.803f)
            close()
            moveToRelative(9.62f, 2.572f)
            lineTo(8.5f, 7.329f)
            verticalLineToRelative(7.45f)
            curveToRelative(0.196f, -0.033f, 0.39f, -0.086f, 0.577f, -0.158f)
            lineToRelative(4.962f, -1.909f)
            curveTo(14.618f, 12.49f, 15f, 11.933f, 15f, 11.312f)
            verticalLineTo(4.686f)
            curveToRelative(0f, -0.047f, -0.002f, -0.094f, -0.007f, -0.14f)
            close()
            moveTo(7.5f, 14.779f)
            verticalLineToRelative(-7.45f)
            lineTo(1.006f, 4.546f)
            curveTo(1.002f, 4.592f, 1f, 4.639f, 1f, 4.686f)
            verticalLineToRelative(6.626f)
            curveToRelative(0f, 0.621f, 0.382f, 1.178f, 0.962f, 1.4f)
            lineToRelative(4.961f, 1.909f)
            curveToRelative(0.188f, 0.072f, 0.381f, 0.125f, 0.577f, 0.158f)
            close()
        }
    }.build()
}
