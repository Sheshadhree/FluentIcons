package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowUp16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowUp16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.5f, 13.5f)
            curveTo(7.5f, 13.776f, 7.724f, 14f, 8f, 14f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(3.803f)
            lineToRelative(3.628f, 4.032f)
            curveToRelative(0.185f, 0.205f, 0.501f, 0.221f, 0.707f, 0.037f)
            curveToRelative(0.205f, -0.185f, 0.221f, -0.501f, 0.037f, -0.707f)
            lineToRelative(-4.5f, -5f)
            curveTo(8.277f, 2.06f, 8.142f, 2f, 8f, 2f)
            reflectiveCurveTo(7.723f, 2.06f, 7.628f, 2.166f)
            lineToRelative(-4.5f, 5f)
            curveTo(2.944f, 7.37f, 2.96f, 7.685f, 3.166f, 7.871f)
            curveTo(3.37f, 8.056f, 3.686f, 8.04f, 3.872f, 7.835f)
            lineTo(7.5f, 3.803f)
            verticalLineTo(13.5f)
            close()
        }
    }.build()
}
