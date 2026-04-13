package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.StarHalf28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.StarHalf28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 3.1f)
            curveToRelative(-0.517f, 0f, -1.033f, 0.27f, -1.299f, 0.808f)
            lineToRelative(-2.69f, 5.452f)
            lineToRelative(-6.018f, 0.875f)
            curveToRelative(-1.19f, 0.173f, -1.664f, 1.634f, -0.804f, 2.473f)
            lineToRelative(4.355f, 4.244f)
            lineToRelative(-1.028f, 5.993f)
            curveToRelative(-0.204f, 1.185f, 1.04f, 2.088f, 2.104f, 1.529f)
            lineTo(14f, 21.645f)
            verticalLineTo(3.1f)
            close()
        }
    }.build()
}
