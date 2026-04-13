package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.StarThreeQuarter16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.StarThreeQuarter16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.808f, 2.101f)
            curveToRelative(-0.33f, -0.669f, -1.284f, -0.669f, -1.614f, 0f)
            lineTo(5.673f, 5.183f)
            lineTo(2.272f, 5.678f)
            curveToRelative(-0.739f, 0.107f, -1.033f, 1.014f, -0.5f, 1.535f)
            lineToRelative(2.462f, 2.399f)
            lineToRelative(-0.581f, 3.387f)
            curveToRelative(-0.126f, 0.736f, 0.645f, 1.296f, 1.306f, 0.949f)
            lineTo(8f, 12.348f)
            lineToRelative(3.042f, 1.6f)
            curveToRelative(0.66f, 0.347f, 1.432f, -0.213f, 1.306f, -0.949f)
            lineToRelative(-0.581f, -3.387f)
            lineToRelative(2.461f, -2.4f)
            curveToRelative(0.534f, -0.52f, 0.24f, -1.427f, -0.499f, -1.534f)
            lineToRelative(-3.4f, -0.495f)
            lineToRelative(-1.522f, -3.082f)
            close()
            moveTo(10f, 12.27f)
            verticalLineTo(6.136f)
            curveToRelative(0.043f, 0.013f, 0.088f, 0.023f, 0.133f, 0.03f)
            lineToRelative(3.253f, 0.472f)
            lineToRelative(-2.354f, 2.294f)
            curveTo(10.82f, 9.14f, 10.723f, 9.437f, 10.774f, 9.73f)
            lineToRelative(0.555f, 3.24f)
            lineTo(10f, 12.27f)
            close()
        }
    }.build()
}
