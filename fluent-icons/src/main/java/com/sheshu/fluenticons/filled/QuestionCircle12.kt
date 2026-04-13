package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.QuestionCircle12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.QuestionCircle12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 1f)
            curveTo(3.239f, 1f, 1f, 3.239f, 1f, 6f)
            reflectiveCurveToRelative(2.239f, 5f, 5f, 5f)
            reflectiveCurveToRelative(5f, -2.239f, 5f, -5f)
            reflectiveCurveToRelative(-2.239f, -5f, -5f, -5f)
            close()
            moveToRelative(0.5f, 7.5f)
            curveTo(6.5f, 8.776f, 6.276f, 9f, 6f, 9f)
            reflectiveCurveTo(5.5f, 8.776f, 5.5f, 8.5f)
            reflectiveCurveTo(5.724f, 8f, 6f, 8f)
            reflectiveCurveToRelative(0.5f, 0.224f, 0.5f, 0.5f)
            close()
            moveTo(5f, 4.753f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(4f, 5.029f, 4f, 4.753f)
            curveTo(4f, 4.164f, 4.272f, 3.707f, 4.67f, 3.41f)
            curveTo(5.054f, 3.125f, 5.54f, 2.998f, 6f, 2.998f)
            curveToRelative(0.46f, 0f, 0.946f, 0.127f, 1.33f, 0.412f)
            curveTo(7.727f, 3.706f, 8f, 4.163f, 8f, 4.752f)
            curveTo(8f, 5.18f, 7.865f, 5.507f, 7.633f, 5.758f)
            curveTo(7.45f, 5.956f, 7.215f, 6.091f, 7.053f, 6.184f)
            lineToRelative(-0.051f, 0.03f)
            curveToRelative(-0.187f, 0.108f, -0.296f, 0.184f, -0.37f, 0.281f)
            curveTo(6.567f, 6.577f, 6.5f, 6.715f, 6.5f, 7f)
            curveToRelative(0f, 0.277f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(5.5f, 7.276f, 5.5f, 7f)
            curveToRelative(0f, -0.465f, 0.12f, -0.827f, 0.338f, -1.112f)
            curveToRelative(0.206f, -0.27f, 0.472f, -0.428f, 0.66f, -0.538f)
            lineToRelative(0.028f, -0.016f)
            curveTo(6.723f, 5.22f, 6.824f, 5.16f, 6.899f, 5.08f)
            curveTo(6.948f, 5.026f, 7f, 4.947f, 7f, 4.752f)
            curveToRelative(0f, -0.248f, -0.103f, -0.417f, -0.267f, -0.54f)
            curveTo(6.555f, 4.08f, 6.29f, 3.999f, 6f, 3.999f)
            reflectiveCurveTo(5.446f, 4.08f, 5.267f, 4.213f)
            curveTo(5.103f, 4.335f, 5f, 4.505f, 5f, 4.753f)
            close()
        }
    }.build()
}
