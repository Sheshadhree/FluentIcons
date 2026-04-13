package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowEnterUp20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowEnterUp20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.796f, 2.236f)
            curveTo(8.654f, 2.086f, 8.456f, 2f, 8.25f, 2f)
            curveTo(8.043f, 2f, 7.846f, 2.085f, 7.704f, 2.236f)
            lineToRelative(-4f, 4.25f)
            curveToRelative(-0.284f, 0.302f, -0.27f, 0.776f, 0.032f, 1.06f)
            curveToRelative(0.302f, 0.284f, 0.776f, 0.27f, 1.06f, -0.032f)
            lineTo(7.5f, 4.641f)
            verticalLineTo(14.75f)
            curveToRelative(0f, 1.795f, 1.455f, 3.25f, 3.25f, 3.25f)
            horizontalLineToRelative(4.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineToRelative(-4.5f)
            curveTo(9.784f, 16.5f, 9f, 15.716f, 9f, 14.75f)
            verticalLineTo(4.641f)
            lineToRelative(2.704f, 2.873f)
            curveToRelative(0.284f, 0.302f, 0.758f, 0.316f, 1.06f, 0.032f)
            curveToRelative(0.302f, -0.284f, 0.316f, -0.758f, 0.032f, -1.06f)
            lineToRelative(-4f, -4.25f)
            close()
        }
    }.build()
}
