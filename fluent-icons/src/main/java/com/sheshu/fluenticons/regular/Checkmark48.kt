package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Checkmark48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Checkmark48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(40.139f, 12.871f)
            curveToRelative(0.485f, 0.491f, 0.48f, 1.282f, -0.01f, 1.768f)
            lineToRelative(-22.25f, 22f)
            curveToRelative(-0.484f, 0.479f, -1.263f, 0.482f, -1.75f, 0.007f)
            lineToRelative(-9.25f, -9f)
            curveToRelative(-0.495f, -0.482f, -0.506f, -1.273f, -0.025f, -1.768f)
            curveToRelative(0.481f, -0.494f, 1.273f, -0.505f, 1.768f, -0.024f)
            lineTo(16.993f, 34f)
            lineToRelative(21.378f, -21.138f)
            curveToRelative(0.491f, -0.485f, 1.282f, -0.48f, 1.768f, 0.01f)
            close()
        }
    }.build()
}
