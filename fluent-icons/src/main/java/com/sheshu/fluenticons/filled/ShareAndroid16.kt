package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ShareAndroid16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ShareAndroid16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 4f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            reflectiveCurveToRelative(-0.895f, 2f, -2f, 2f)
            curveToRelative(-0.602f, 0f, -1.142f, -0.266f, -1.508f, -0.687f)
            lineTo(5.956f, 7.581f)
            curveTo(5.985f, 7.716f, 6f, 7.856f, 6f, 8f)
            curveToRelative(0f, 0.144f, -0.015f, 0.284f, -0.044f, 0.419f)
            lineToRelative(4.535f, 2.268f)
            curveTo(10.858f, 10.266f, 11.399f, 10f, 12f, 10f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            reflectiveCurveToRelative(-0.895f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.895f, -2f, -2f)
            curveToRelative(0f, -0.144f, 0.015f, -0.284f, 0.044f, -0.419f)
            lineTo(5.508f, 9.313f)
            curveTo(5.143f, 9.734f, 4.603f, 10f, 4f, 10f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            reflectiveCurveToRelative(0.895f, -2f, 2f, -2f)
            curveToRelative(0.602f, 0f, 1.142f, 0.266f, 1.508f, 0.687f)
            lineToRelative(4.536f, -2.268f)
            curveTo(10.015f, 4.284f, 10f, 4.144f, 10f, 4f)
            close()
        }
    }.build()
}
