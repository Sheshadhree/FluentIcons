package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Send48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Send48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.262f, 4.244f)
            curveTo(5.475f, 3.351f, 3.497f, 5.056f, 4.116f, 6.955f)
            lineTo(8.13f, 19.26f)
            curveToRelative(0.232f, 0.71f, 0.838f, 1.23f, 1.573f, 1.353f)
            lineToRelative(15.86f, 2.643f)
            curveToRelative(0.835f, 0.14f, 0.835f, 1.34f, 0f, 1.48f)
            lineTo(9.704f, 27.378f)
            curveTo(8.969f, 27.5f, 8.363f, 28.022f, 8.132f, 28.73f)
            lineTo(4.116f, 41.042f)
            curveToRelative(-0.62f, 1.9f, 1.359f, 3.605f, 3.146f, 2.712f)
            lineToRelative(35.494f, -17.742f)
            curveToRelative(1.659f, -0.83f, 1.659f, -3.197f, 0f, -4.026f)
            lineTo(7.262f, 4.244f)
            close()
        }
    }.build()
}
