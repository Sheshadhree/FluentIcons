package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.StarThreeQuarter16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.StarThreeQuarter16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.194f, 2.101f)
            curveToRelative(0.33f, -0.669f, 1.284f, -0.669f, 1.614f, 0f)
            lineTo(10f, 4.516f)
            verticalLineTo(13.4f)
            lineToRelative(-1.999f, -1.051f)
            lineToRelative(-3.042f, 1.599f)
            curveToRelative(-0.66f, 0.347f, -1.432f, -0.213f, -1.306f, -0.949f)
            lineToRelative(0.58f, -3.387f)
            lineToRelative(-2.46f, -2.4f)
            curveToRelative(-0.534f, -0.52f, -0.24f, -1.427f, 0.499f, -1.534f)
            lineToRelative(3.4f, -0.495f)
            lineToRelative(1.522f, -3.082f)
            close()
        }
    }.build()
}
