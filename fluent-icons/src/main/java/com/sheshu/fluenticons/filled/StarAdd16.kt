package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.StarAdd16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.StarAdd16",
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
            curveToRelative(0f, -2.95f, 2.324f, -5.358f, 5.241f, -5.493f)
            lineTo(8.808f, 2.1f)
            close()
            moveTo(15f, 10.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            reflectiveCurveTo(6f, 12.985f, 6f, 10.5f)
            curveTo(6f, 8.014f, 8.015f, 6f, 10.5f, 6f)
            reflectiveCurveTo(15f, 8.014f, 15f, 10.5f)
            close()
            moveToRelative(-4f, -2f)
            curveTo(11f, 8.223f, 10.776f, 8f, 10.5f, 8f)
            reflectiveCurveTo(10f, 8.223f, 10f, 8.5f)
            verticalLineTo(10f)
            horizontalLineTo(8.5f)
            curveTo(8.224f, 10f, 8f, 10.223f, 8f, 10.5f)
            curveTo(8f, 10.776f, 8.224f, 11f, 8.5f, 11f)
            horizontalLineTo(10f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(11f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            curveToRelative(0f, -0.277f, -0.224f, -0.5f, -0.5f, -0.5f)
            horizontalLineTo(11f)
            verticalLineTo(8.5f)
            close()
        }
    }.build()
}
