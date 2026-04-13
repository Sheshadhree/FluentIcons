package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CaretUp16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CaretUp16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.136f, 9.427f)
            curveToRelative(-0.461f, 0.663f, 0.013f, 1.571f, 0.82f, 1.571f)
            horizontalLineToRelative(6.087f)
            curveToRelative(0.808f, 0f, 1.282f, -0.908f, 0.82f, -1.571f)
            lineTo(9.232f, 5.643f)
            curveToRelative(-0.597f, -0.858f, -1.866f, -0.858f, -2.462f, 0f)
            lineTo(4.136f, 9.427f)
            close()
            moveToRelative(0.82f, 0.571f)
            lineTo(7.59f, 6.214f)
            curveToRelative(0.2f, -0.286f, 0.622f, -0.286f, 0.821f, 0f)
            lineToRelative(2.633f, 3.784f)
            horizontalLineTo(4.957f)
            close()
        }
    }.build()
}
