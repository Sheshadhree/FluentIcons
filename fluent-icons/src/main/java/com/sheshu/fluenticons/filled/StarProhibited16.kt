package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.StarProhibited16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.StarProhibited16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.808f, 2.101f)
            curveToRelative(-0.33f, -0.669f, -1.284f, -0.669f, -1.614f, 0f)
            lineTo(5.673f, 5.183f)
            lineTo(2.272f, 5.678f)
            curveToRelative(-0.739f, 0.107f, -1.033f, 1.014f, -0.5f, 1.535f)
            lineToRelative(2.462f, 2.399f)
            lineToRelative(-0.581f, 3.387f)
            curveToRelative(-0.126f, 0.736f, 0.645f, 1.296f, 1.306f, 0.949f)
            lineToRelative(0.91f, -0.479f)
            curveTo(5.32f, 12.613f, 5f, 11.593f, 5f, 10.5f)
            curveToRelative(0f, -2.95f, 2.324f, -5.358f, 5.241f, -5.494f)
            lineTo(8.808f, 2.101f)
            close()
            moveTo(6f, 10.5f)
            curveToRelative(0f, 2.486f, 2.015f, 4.5f, 4.5f, 4.5f)
            reflectiveCurveToRelative(4.5f, -2.014f, 4.5f, -4.5f)
            reflectiveCurveTo(12.985f, 6f, 10.5f, 6f)
            reflectiveCurveTo(6f, 8.014f, 6f, 10.5f)
            close()
            moveToRelative(1f, 0f)
            curveTo(7f, 8.566f, 8.567f, 7f, 10.5f, 7f)
            curveToRelative(0.786f, 0f, 1.512f, 0.26f, 2.096f, 0.697f)
            lineToRelative(-4.9f, 4.9f)
            curveTo(7.26f, 12.01f, 7f, 11.286f, 7f, 10.499f)
            close()
            moveToRelative(3.5f, 3.5f)
            curveToRelative(-0.786f, 0f, -1.512f, -0.259f, -2.096f, -0.696f)
            lineToRelative(4.9f, -4.9f)
            curveTo(13.74f, 8.988f, 14f, 9.713f, 14f, 10.5f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            close()
        }
    }.build()
}
