package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PeopleInterwoven16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PeopleInterwoven16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.406f, 7.797f)
            curveToRelative(1.504f, 0f, 2.458f, 1.346f, 3.636f, 1.826f)
            curveToRelative(0.163f, 0.067f, 0.24f, 0.269f, 0.14f, 0.413f)
            lineToRelative(-2.813f, 4.055f)
            curveToRelative(-0.435f, 0.628f, -1.35f, 0.664f, -1.835f, 0.073f)
            lineToRelative(-2.36f, -2.882f)
            curveToRelative(-0.126f, -0.153f, -0.15f, -0.366f, -0.055f, -0.54f)
            curveToRelative(0.667f, -1.206f, 1.955f, -2.945f, 3.287f, -2.945f)
            close()
            moveToRelative(6.192f, 0.487f)
            curveToRelative(0.435f, -0.627f, 1.35f, -0.664f, 1.835f, -0.073f)
            lineToRelative(2.36f, 2.882f)
            curveToRelative(0.126f, 0.153f, 0.15f, 0.367f, 0.055f, 0.54f)
            curveToRelative(-0.667f, 1.206f, -1.955f, 2.946f, -3.287f, 2.946f)
            curveToRelative(-1.504f, 0f, -2.459f, -1.346f, -3.636f, -1.826f)
            curveToRelative(-0.163f, -0.066f, -0.24f, -0.27f, -0.14f, -0.414f)
            lineToRelative(2.813f, -4.055f)
            close()
            moveTo(5f, 2f)
            curveToRelative(1.104f, 0f, 2f, 0.896f, 2f, 2f)
            reflectiveCurveTo(6.104f, 6f, 5f, 6f)
            reflectiveCurveTo(3f, 5.104f, 3f, 4f)
            reflectiveCurveToRelative(0.896f, -2f, 2f, -2f)
            close()
            moveToRelative(6f, 0f)
            curveToRelative(1.104f, 0f, 2f, 0.896f, 2f, 2f)
            reflectiveCurveToRelative(-0.896f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.896f, -2f, -2f)
            reflectiveCurveToRelative(0.896f, -2f, 2f, -2f)
            close()
        }
    }.build()
}
