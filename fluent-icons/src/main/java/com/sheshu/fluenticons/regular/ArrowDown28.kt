package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowDown28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowDown28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.791f, 15.267f)
            curveToRelative(0.288f, -0.299f, 0.279f, -0.774f, -0.02f, -1.06f)
            curveToRelative(-0.299f, -0.288f, -0.773f, -0.279f, -1.06f, 0.02f)
            lineTo(14.75f, 22.5f)
            verticalLineTo(3.748f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            reflectiveCurveToRelative(-0.75f, 0.336f, -0.75f, 0.75f)
            verticalLineTo(22.5f)
            lineToRelative(-7.958f, -8.273f)
            curveToRelative(-0.288f, -0.299f, -0.763f, -0.308f, -1.061f, -0.02f)
            curveToRelative(-0.299f, 0.286f, -0.308f, 0.761f, -0.02f, 1.06f)
            lineToRelative(9.069f, 9.428f)
            curveToRelative(0.393f, 0.409f, 1.048f, 0.409f, 1.441f, 0f)
            lineToRelative(9.07f, -9.428f)
            close()
        }
    }.build()
}
