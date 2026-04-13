package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CaretUp16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CaretUp16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.957f, 10.998f)
            curveToRelative(-0.808f, 0f, -1.282f, -0.908f, -0.821f, -1.571f)
            lineToRelative(2.633f, -3.784f)
            curveToRelative(0.596f, -0.858f, 1.865f, -0.858f, 2.462f, 0f)
            lineToRelative(2.633f, 3.784f)
            curveToRelative(0.461f, 0.663f, -0.013f, 1.571f, -0.821f, 1.571f)
            horizontalLineTo(4.957f)
            close()
        }
    }.build()
}
