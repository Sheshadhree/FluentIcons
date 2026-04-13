package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowEnterLeft20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowEnterLeft20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.641f, 12.5f)
            lineToRelative(2.873f, 2.704f)
            curveToRelative(0.302f, 0.284f, 0.316f, 0.758f, 0.032f, 1.06f)
            curveToRelative(-0.284f, 0.302f, -0.758f, 0.316f, -1.06f, 0.032f)
            lineToRelative(-4.25f, -4f)
            curveTo(2.086f, 12.154f, 2f, 11.956f, 2f, 11.75f)
            curveToRelative(0f, -0.207f, 0.085f, -0.404f, 0.236f, -0.546f)
            lineToRelative(4.25f, -4f)
            curveToRelative(0.302f, -0.284f, 0.776f, -0.27f, 1.06f, 0.032f)
            curveToRelative(0.284f, 0.302f, 0.27f, 0.776f, -0.032f, 1.06f)
            lineTo(4.641f, 11f)
            horizontalLineTo(14.75f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineToRelative(-4.5f)
            curveTo(16.5f, 4.336f, 16.836f, 4f, 17.25f, 4f)
            reflectiveCurveTo(18f, 4.336f, 18f, 4.75f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineTo(4.641f)
            close()
        }
    }.build()
}
