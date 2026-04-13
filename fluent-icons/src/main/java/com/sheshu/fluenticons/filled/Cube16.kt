package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Cube16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Cube16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.923f, 1.378f)
            curveToRelative(0.693f, -0.267f, 1.46f, -0.267f, 2.154f, 0f)
            lineToRelative(4.962f, 1.908f)
            curveTo(14.618f, 3.509f, 15f, 4.066f, 15f, 4.686f)
            verticalLineToRelative(6.626f)
            curveToRelative(0f, 0.621f, -0.382f, 1.178f, -0.961f, 1.4f)
            lineToRelative(-4.962f, 1.909f)
            curveToRelative(-0.693f, 0.266f, -1.46f, 0.266f, -2.154f, 0f)
            lineToRelative(-4.962f, -1.909f)
            curveTo(1.383f, 12.49f, 1f, 11.933f, 1f, 11.312f)
            verticalLineTo(4.686f)
            curveToRelative(0f, -0.62f, 0.382f, -1.177f, 0.962f, -1.4f)
            lineToRelative(4.961f, -1.908f)
            close()
            moveTo(4.697f, 5.04f)
            curveTo(4.443f, 4.93f, 4.149f, 5.048f, 4.04f, 5.302f)
            curveTo(3.932f, 5.556f, 4.05f, 5.85f, 4.303f, 5.96f)
            lineTo(7.5f, 7.329f)
            verticalLineToRelative(3.17f)
            curveTo(7.5f, 10.775f, 7.724f, 11f, 8f, 11f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(7.33f)
            lineToRelative(3.197f, -1.37f)
            curveToRelative(0.254f, -0.11f, 0.371f, -0.403f, 0.263f, -0.657f)
            curveToRelative(-0.11f, -0.254f, -0.403f, -0.371f, -0.657f, -0.262f)
            lineTo(8f, 6.455f)
            lineTo(4.697f, 5.04f)
            close()
        }
    }.build()
}
