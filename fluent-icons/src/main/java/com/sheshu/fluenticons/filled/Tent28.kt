package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Tent28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Tent28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.601f, 3.211f)
            curveToRelative(-0.143f, -0.17f, -0.354f, -0.27f, -0.576f, -0.27f)
            curveToRelative(-0.223f, 0f, -0.434f, 0.1f, -0.576f, 0.27f)
            curveToRelative(-1.795f, 2.154f, -5.337f, 4.71f, -7.374f, 5.848f)
            curveTo(5.87f, 9.174f, 5.73f, 9.379f, 5.698f, 9.61f)
            lineTo(4.06f, 21.5f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 21.5f, 2f, 21.835f, 2f, 22.25f)
            curveTo(2f, 22.664f, 2.336f, 23f, 2.75f, 23f)
            horizontalLineToRelative(22.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            curveToRelative(0f, -0.415f, -0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineToRelative(-1.26f)
            lineTo(22.352f, 9.61f)
            curveToRelative(-0.033f, -0.233f, -0.172f, -0.437f, -0.378f, -0.552f)
            curveToRelative(-2.036f, -1.138f, -5.578f, -3.694f, -7.373f, -5.848f)
            close()
            moveTo(10.272f, 21.5f)
            curveToRelative(1.259f, -1.828f, 2.557f, -4.178f, 3.728f, -7.89f)
            curveToRelative(1.059f, 3.348f, 2.24f, 5.664f, 3.728f, 7.89f)
            horizontalLineToRelative(-7.456f)
            close()
        }
    }.build()
}
