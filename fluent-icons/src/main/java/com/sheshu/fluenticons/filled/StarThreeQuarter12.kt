package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.StarThreeQuarter12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.StarThreeQuarter12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7f, 2.116f)
            lineToRelative(-0.282f, -0.57f)
            curveToRelative(-0.293f, -0.595f, -1.141f, -0.595f, -1.434f, 0f)
            lineTo(4.171f, 3.798f)
            lineTo(1.686f, 4.16f)
            curveTo(1.03f, 4.255f, 0.768f, 5.061f, 1.242f, 5.524f)
            lineToRelative(1.8f, 1.753f)
            lineToRelative(-0.425f, 2.476f)
            curveToRelative(-0.112f, 0.654f, 0.574f, 1.152f, 1.16f, 0.844f)
            lineToRelative(2.224f, -1.17f)
            lineTo(7f, 9.954f)
            verticalLineTo(2.117f)
            close()
        }
    }.build()
}
