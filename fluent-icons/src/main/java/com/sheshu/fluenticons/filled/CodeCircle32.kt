package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CodeCircle32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CodeCircle32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(30f, 16f)
            curveToRelative(0f, -7.732f, -6.268f, -14f, -14f, -14f)
            reflectiveCurveTo(2f, 8.268f, 2f, 16f)
            reflectiveCurveToRelative(6.268f, 14f, 14f, 14f)
            reflectiveCurveToRelative(14f, -6.268f, 14f, -14f)
            close()
            moveTo(19.918f, 9.394f)
            lineToRelative(-6f, 14f)
            curveToRelative(-0.217f, 0.508f, -0.805f, 0.743f, -1.313f, 0.525f)
            curveToRelative(-0.508f, -0.217f, -0.743f, -0.805f, -0.525f, -1.313f)
            lineToRelative(6f, -14f)
            curveToRelative(0.218f, -0.507f, 0.805f, -0.742f, 1.313f, -0.525f)
            curveToRelative(0.508f, 0.218f, 0.743f, 0.806f, 0.525f, 1.313f)
            close()
            moveToRelative(-8.26f, 3.859f)
            lineTo(8.518f, 16f)
            lineToRelative(3.14f, 2.748f)
            curveToRelative(0.416f, 0.363f, 0.458f, 0.995f, 0.095f, 1.41f)
            curveToRelative(-0.364f, 0.416f, -0.996f, 0.458f, -1.412f, 0.095f)
            lineToRelative(-4f, -3.5f)
            curveTo(6.125f, 16.563f, 6f, 16.288f, 6f, 16f)
            reflectiveCurveToRelative(0.125f, -0.563f, 0.341f, -0.752f)
            lineToRelative(4f, -3.5f)
            curveToRelative(0.416f, -0.364f, 1.048f, -0.322f, 1.412f, 0.094f)
            curveToRelative(0.363f, 0.415f, 0.321f, 1.047f, -0.095f, 1.41f)
            close()
            moveToRelative(8.59f, 6.906f)
            curveToRelative(-0.364f, -0.416f, -0.322f, -1.048f, 0.093f, -1.412f)
            lineTo(23.482f, 16f)
            lineToRelative(-3.14f, -2.747f)
            curveToRelative(-0.415f, -0.364f, -0.457f, -0.996f, -0.094f, -1.411f)
            curveToRelative(0.364f, -0.416f, 0.996f, -0.458f, 1.412f, -0.095f)
            lineToRelative(4f, 3.5f)
            curveTo(25.875f, 15.438f, 26f, 15.713f, 26f, 16f)
            curveToRelative(0f, 0.289f, -0.125f, 0.563f, -0.341f, 0.753f)
            lineToRelative(-4f, 3.5f)
            curveToRelative(-0.416f, 0.363f, -1.048f, 0.321f, -1.412f, -0.094f)
            close()
        }
    }.build()
}
