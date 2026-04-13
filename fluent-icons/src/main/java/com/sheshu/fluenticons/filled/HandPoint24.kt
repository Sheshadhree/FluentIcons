package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.HandPoint24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.HandPoint24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.5f, 2f)
            curveTo(10.12f, 2f, 9f, 3.12f, 9f, 4.5f)
            verticalLineToRelative(6.41f)
            lineToRelative(-1.495f, -0.574f)
            curveToRelative(-2.04f, -0.785f, -4.346f, 0.07f, -5.382f, 1.996f)
            curveToRelative(-0.301f, 0.558f, -0.035f, 1.226f, 0.512f, 1.463f)
            curveToRelative(5.662f, 2.456f, 7.454f, 4.673f, 8.19f, 6.29f)
            curveToRelative(0.526f, 1.156f, 1.73f, 2.104f, 3.172f, 1.882f)
            lineToRelative(3.455f, -0.533f)
            curveToRelative(1.096f, -0.169f, 1.982f, -0.978f, 2.25f, -2.054f)
            lineToRelative(1.153f, -4.633f)
            curveToRelative(0.673f, -2.705f, -1.118f, -5.406f, -3.872f, -5.839f)
            lineTo(14f, 8.44f)
            verticalLineTo(4.5f)
            curveTo(14f, 3.12f, 12.88f, 2f, 11.5f, 2f)
            close()
        }
    }.build()
}
