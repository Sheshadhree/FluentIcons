package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ImageCircle20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ImageCircle20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 3f)
            curveToRelative(-3.866f, 0f, -7f, 3.134f, -7f, 7f)
            curveToRelative(0f, 1.755f, 0.646f, 3.359f, 1.712f, 4.587f)
            lineToRelative(4.236f, -4.168f)
            curveToRelative(0.584f, -0.575f, 1.52f, -0.575f, 2.104f, 0f)
            lineToRelative(4.236f, 4.168f)
            curveTo(16.354f, 13.36f, 17f, 11.755f, 17f, 10f)
            curveToRelative(0f, -3.866f, -3.134f, -7f, -7f, -7f)
            close()
            moveToRelative(0f, 14f)
            curveToRelative(1.751f, 0f, 3.352f, -0.643f, 4.58f, -1.706f)
            lineToRelative(-4.23f, -4.163f)
            curveToRelative(-0.194f, -0.191f, -0.506f, -0.191f, -0.7f, 0f)
            lineToRelative(-4.23f, 4.163f)
            curveTo(6.648f, 16.357f, 8.249f, 17f, 10f, 17f)
            close()
            moveToRelative(-8f, -7f)
            curveToRelative(0f, -4.418f, 3.582f, -8f, 8f, -8f)
            reflectiveCurveToRelative(8f, 3.582f, 8f, 8f)
            reflectiveCurveToRelative(-3.582f, 8f, -8f, 8f)
            reflectiveCurveToRelative(-8f, -3.582f, -8f, -8f)
            close()
            moveToRelative(11f, -2.5f)
            curveTo(13f, 7.224f, 12.776f, 7f, 12.5f, 7f)
            reflectiveCurveTo(12f, 7.224f, 12f, 7.5f)
            reflectiveCurveTo(12.224f, 8f, 12.5f, 8f)
            reflectiveCurveTo(13f, 7.776f, 13f, 7.5f)
            close()
            moveToRelative(1f, 0f)
            curveTo(14f, 8.328f, 13.328f, 9f, 12.5f, 9f)
            reflectiveCurveTo(11f, 8.328f, 11f, 7.5f)
            reflectiveCurveTo(11.672f, 6f, 12.5f, 6f)
            reflectiveCurveTo(14f, 6.672f, 14f, 7.5f)
            close()
        }
    }.build()
}
