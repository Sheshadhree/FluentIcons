package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ChatEmpty32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ChatEmpty32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 4f)
            curveTo(9.373f, 4f, 4f, 9.373f, 4f, 16f)
            curveToRelative(0f, 2.165f, 0.572f, 4.193f, 1.573f, 5.945f)
            curveToRelative(0.134f, 0.233f, 0.168f, 0.51f, 0.094f, 0.77f)
            lineToRelative(-1.439f, 5.059f)
            lineToRelative(5.061f, -1.44f)
            curveToRelative(0.259f, -0.073f, 0.536f, -0.039f, 0.77f, 0.094f)
            curveTo(11.808f, 27.428f, 13.835f, 28f, 16f, 28f)
            curveToRelative(6.628f, 0f, 12f, -5.373f, 12f, -12f)
            reflectiveCurveTo(22.628f, 4f, 16f, 4f)
            close()
            moveTo(2f, 16f)
            curveTo(2f, 8.268f, 8.268f, 2f, 16f, 2f)
            reflectiveCurveToRelative(14f, 6.268f, 14f, 14f)
            reflectiveCurveToRelative(-6.268f, 14f, -14f, 14f)
            curveToRelative(-2.368f, 0f, -4.602f, -0.589f, -6.56f, -1.629f)
            lineToRelative(-5.528f, 1.572f)
            curveToRelative(-1.13f, 0.322f, -2.174f, -0.723f, -1.853f, -1.853f)
            lineToRelative(1.572f, -5.527f)
            curveTo(2.59f, 20.605f, 2f, 18.37f, 2f, 16f)
            close()
        }
    }.build()
}
