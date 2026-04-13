package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Pentagon48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Pentagon48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.502f, 4.313f)
            curveToRelative(1.49f, -1.084f, 3.509f, -1.084f, 5f, 0f)
            lineToRelative(15.75f, 11.456f)
            curveToRelative(1.488f, 1.082f, 2.11f, 3f, 1.543f, 4.75f)
            lineToRelative(-6.018f, 18.54f)
            curveToRelative(-0.569f, 1.752f, -2.2f, 2.938f, -4.042f, 2.938f)
            horizontalLineTo(14.268f)
            curveToRelative(-1.842f, 0f, -3.474f, -1.187f, -4.042f, -2.938f)
            lineToRelative(-6.018f, -18.54f)
            curveToRelative(-0.568f, -1.75f, 0.054f, -3.668f, 1.542f, -4.75f)
            lineTo(21.502f, 4.313f)
            close()
        }
    }.build()
}
