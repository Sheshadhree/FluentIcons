package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ImageCircle20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ImageCircle20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18f, 10f)
            curveToRelative(0f, 2.028f, -0.755f, 3.88f, -1.998f, 5.29f)
            lineToRelative(-4.95f, -4.871f)
            curveToRelative(-0.583f, -0.575f, -1.52f, -0.575f, -2.104f, 0f)
            lineToRelative(-4.95f, 4.871f)
            curveTo(2.755f, 13.88f, 2f, 12.028f, 2f, 10f)
            curveToRelative(0f, -4.418f, 3.582f, -8f, 8f, -8f)
            reflectiveCurveToRelative(8f, 3.582f, 8f, 8f)
            close()
            moveToRelative(-7.649f, 1.131f)
            lineToRelative(4.944f, 4.866f)
            curveTo(13.885f, 17.244f, 12.03f, 18f, 10f, 18f)
            reflectiveCurveToRelative(-3.884f, -0.756f, -5.295f, -2.003f)
            lineToRelative(4.945f, -4.866f)
            curveToRelative(0.194f, -0.191f, 0.506f, -0.191f, 0.701f, 0f)
            close()
            moveTo(12.75f, 8.5f)
            curveTo(13.44f, 8.5f, 14f, 7.94f, 14f, 7.25f)
            reflectiveCurveTo(13.44f, 6f, 12.75f, 6f)
            reflectiveCurveTo(11.5f, 6.56f, 11.5f, 7.25f)
            reflectiveCurveToRelative(0.56f, 1.25f, 1.25f, 1.25f)
            close()
        }
    }.build()
}
