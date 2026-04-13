package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Comma24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Comma24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.2f, 12.341f)
            curveTo(13.569f, 12.758f, 12.813f, 13f, 12f, 13f)
            curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
            reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
            curveToRelative(2.029f, 0f, 3.705f, 1.51f, 3.965f, 3.469f)
            curveToRelative(0.365f, 1.792f, 0.507f, 3.947f, -0.207f, 5.898f)
            curveToRelative(-0.766f, 2.09f, -2.464f, 3.804f, -5.505f, 4.6f)
            curveToRelative(-0.534f, 0.14f, -1.08f, -0.18f, -1.22f, -0.714f)
            curveToRelative(-0.14f, -0.534f, 0.18f, -1.08f, 0.714f, -1.22f)
            curveToRelative(2.46f, -0.644f, 3.61f, -1.93f, 4.133f, -3.354f)
            curveToRelative(0.155f, -0.425f, 0.26f, -0.874f, 0.32f, -1.338f)
            close()
        }
    }.build()
}
