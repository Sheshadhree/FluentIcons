package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.FontIncrease24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.FontIncrease24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.195f, 5.755f)
            curveToRelative(0.279f, 0.306f, 0.753f, 0.329f, 1.06f, 0.05f)
            lineTo(18.5f, 3.764f)
            lineToRelative(2.245f, 2.04f)
            curveToRelative(0.307f, 0.28f, 0.781f, 0.257f, 1.06f, -0.05f)
            curveToRelative(0.279f, -0.306f, 0.256f, -0.78f, -0.05f, -1.059f)
            lineToRelative(-2.75f, -2.5f)
            curveToRelative(-0.287f, -0.26f, -0.723f, -0.26f, -1.01f, 0f)
            lineToRelative(-2.75f, 2.5f)
            curveToRelative(-0.306f, 0.279f, -0.329f, 0.753f, -0.05f, 1.06f)
            close()
            moveTo(12f, 4f)
            curveToRelative(0.308f, 0f, 0.584f, 0.188f, 0.697f, 0.473f)
            lineToRelative(5.75f, 14.5f)
            curveToRelative(0.153f, 0.385f, -0.035f, 0.821f, -0.42f, 0.974f)
            curveToRelative(-0.386f, 0.153f, -0.822f, -0.036f, -0.974f, -0.42f)
            lineTo(15.258f, 15f)
            horizontalLineTo(8.742f)
            lineToRelative(-1.795f, 4.526f)
            curveTo(6.795f, 19.911f, 6.36f, 20.1f, 5.974f, 19.947f)
            curveToRelative(-0.385f, -0.153f, -0.574f, -0.589f, -0.421f, -0.974f)
            lineToRelative(5.75f, -14.5f)
            curveTo(11.416f, 4.188f, 11.693f, 4f, 12f, 4f)
            close()
            moveToRelative(-2.663f, 9.5f)
            horizontalLineToRelative(5.326f)
            lineTo(12f, 6.785f)
            lineTo(9.337f, 13.5f)
            close()
        }
    }.build()
}
