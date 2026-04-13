package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.StarOneQuarter24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.StarOneQuarter24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9f, 6.725f)
            lineTo(8.43f, 7.88f)
            lineTo(3.157f, 8.646f)
            curveToRelative(-1.107f, 0.16f, -1.55f, 1.522f, -0.748f, 2.303f)
            lineToRelative(3.815f, 3.719f)
            lineToRelative(-0.9f, 5.25f)
            curveToRelative(-0.15f, 0.871f, 0.54f, 1.579f, 1.325f, 1.582f)
            curveToRelative(0.21f, 0.001f, 0.426f, -0.048f, 0.636f, -0.158f)
            lineTo(9f, 20.44f)
            verticalLineTo(6.725f)
            close()
        }
    }.build()
}
