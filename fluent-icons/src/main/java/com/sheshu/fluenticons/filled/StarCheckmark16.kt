package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.StarCheckmark16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.StarCheckmark16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.808f, 2.102f)
            curveToRelative(-0.33f, -0.669f, -1.284f, -0.669f, -1.614f, 0f)
            lineTo(5.673f, 5.184f)
            lineTo(2.272f, 5.68f)
            curveToRelative(-0.739f, 0.107f, -1.033f, 1.014f, -0.5f, 1.535f)
            lineToRelative(2.462f, 2.399f)
            lineTo(3.653f, 13f)
            curveToRelative(-0.126f, 0.736f, 0.645f, 1.296f, 1.306f, 0.949f)
            lineToRelative(0.91f, -0.479f)
            curveTo(5.32f, 12.613f, 5f, 11.594f, 5f, 10.5f)
            curveToRelative(0f, -2.95f, 2.324f, -5.359f, 5.241f, -5.494f)
            lineTo(8.808f, 2.103f)
            close()
            moveTo(15f, 10.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            reflectiveCurveTo(6f, 12.985f, 6f, 10.5f)
            reflectiveCurveTo(8.015f, 6f, 10.5f, 6f)
            reflectiveCurveTo(15f, 8.015f, 15f, 10.5f)
            close()
            moveToRelative(-2.146f, -1.854f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            lineTo(9.5f, 11.293f)
            lineToRelative(-0.646f, -0.647f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.707f, 0f)
            curveToRelative(-0.196f, 0.196f, -0.196f, 0.512f, 0f, 0.708f)
            lineToRelative(1f, 1f)
            curveToRelative(0.195f, 0.195f, 0.511f, 0.195f, 0.707f, 0f)
            lineToRelative(3f, -3f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.707f)
            close()
        }
    }.build()
}
