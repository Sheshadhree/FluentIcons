package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Send28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Send28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.79f, 2.625f)
            curveToRelative(-0.963f, -0.46f, -2.021f, 0.42f, -1.746f, 1.451f)
            lineToRelative(2.016f, 7.533f)
            curveToRelative(0.103f, 0.387f, 0.428f, 0.675f, 0.824f, 0.732f)
            lineToRelative(9.884f, 1.412f)
            curveToRelative(0.286f, 0.04f, 0.286f, 0.454f, 0f, 0.495f)
            lineToRelative(-9.883f, 1.411f)
            curveToRelative(-0.396f, 0.057f, -0.72f, 0.345f, -0.824f, 0.732f)
            lineToRelative(-2.017f, 7.537f)
            curveToRelative(-0.275f, 1.03f, 0.783f, 1.91f, 1.746f, 1.451f)
            lineTo(25.288f, 15.13f)
            curveToRelative(0.949f, -0.452f, 0.949f, -1.804f, 0f, -2.257f)
            lineTo(3.79f, 2.626f)
            close()
        }
    }.build()
}
