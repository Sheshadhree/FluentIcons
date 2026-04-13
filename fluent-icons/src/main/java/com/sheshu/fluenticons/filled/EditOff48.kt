package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.EditOff48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.EditOff48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(28f, 29.768f)
            lineToRelative(13.866f, 13.866f)
            curveToRelative(0.488f, 0.488f, 1.28f, 0.488f, 1.768f, 0f)
            reflectiveCurveToRelative(0.488f, -1.28f, 0f, -1.768f)
            lineToRelative(-37.5f, -37.5f)
            curveToRelative(-0.488f, -0.488f, -1.28f, -0.488f, -1.768f, 0f)
            reflectiveCurveToRelative(-0.488f, 1.28f, 0f, 1.768f)
            lineTo(18.233f, 20f)
            lineTo(8.037f, 30.197f)
            curveToRelative(-0.761f, 0.762f, -1.304f, 1.715f, -1.571f, 2.758f)
            lineTo(4.039f, 42.44f)
            curveToRelative(-0.11f, 0.428f, 0.015f, 0.882f, 0.327f, 1.194f)
            curveToRelative(0.312f, 0.312f, 0.766f, 0.436f, 1.194f, 0.327f)
            lineToRelative(9.486f, -2.424f)
            curveToRelative(1.044f, -0.267f, 1.998f, -0.81f, 2.76f, -1.573f)
            lineToRelative(10.195f, -10.196f)
            close()
            moveToRelative(10f, -10.001f)
            lineToRelative(-6.464f, 6.466f)
            lineToRelative(-9.768f, -9.768f)
            lineTo(28.233f, 10f)
            lineToRelative(9.768f, 9.768f)
            close()
            moveTo(32.207f, 6.026f)
            curveToRelative(2.697f, -2.698f, 7.07f, -2.698f, 9.768f, 0f)
            curveToRelative(2.697f, 2.697f, 2.698f, 7.07f, 0f, 9.767f)
            lineToRelative(-2.205f, 2.206f)
            lineTo(30f, 8.231f)
            lineToRelative(2.205f, -2.205f)
            close()
        }
    }.build()
}
