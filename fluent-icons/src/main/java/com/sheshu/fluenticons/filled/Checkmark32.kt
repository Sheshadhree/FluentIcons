package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Checkmark32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Checkmark32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(29.907f, 5.14f)
            curveToRelative(0.475f, 0.502f, 0.454f, 1.293f, -0.047f, 1.767f)
            lineToRelative(-19f, 18f)
            curveToRelative(-0.242f, 0.23f, -0.566f, 0.353f, -0.9f, 0.342f)
            curveToRelative(-0.332f, -0.01f, -0.648f, -0.153f, -0.875f, -0.397f)
            lineToRelative(-6.75f, -7.25f)
            curveToRelative(-0.47f, -0.506f, -0.442f, -1.296f, 0.063f, -1.767f)
            curveToRelative(0.506f, -0.47f, 1.296f, -0.442f, 1.767f, 0.063f)
            lineToRelative(5.89f, 6.327f)
            lineTo(28.14f, 5.093f)
            curveToRelative(0.502f, -0.475f, 1.293f, -0.454f, 1.767f, 0.047f)
            close()
        }
    }.build()
}
