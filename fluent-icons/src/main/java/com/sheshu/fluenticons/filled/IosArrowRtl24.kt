package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.IosArrowRtl24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.IosArrowRtl24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.273f, 3.687f)
            curveToRelative(-0.38f, -0.402f, -0.361f, -1.035f, 0.04f, -1.414f)
            curveToRelative(0.402f, -0.38f, 1.034f, -0.361f, 1.414f, 0.04f)
            lineToRelative(8.5f, 9f)
            curveToRelative(0.364f, 0.386f, 0.364f, 0.988f, 0f, 1.374f)
            lineToRelative(-8.5f, 9.001f)
            curveToRelative(-0.38f, 0.402f, -1.012f, 0.42f, -1.414f, 0.04f)
            curveToRelative(-0.401f, -0.379f, -0.42f, -1.012f, -0.04f, -1.413f)
            lineTo(19.125f, 12f)
            lineToRelative(-7.852f, -8.313f)
            close()
        }
    }.build()
}
