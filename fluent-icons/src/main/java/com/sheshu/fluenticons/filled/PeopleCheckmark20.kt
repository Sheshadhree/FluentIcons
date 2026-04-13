package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PeopleCheckmark20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PeopleCheckmark20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.75f, 9f)
            curveTo(8.545f, 9f, 10f, 7.545f, 10f, 5.75f)
            reflectiveCurveTo(8.545f, 2.5f, 6.75f, 2.5f)
            reflectiveCurveTo(3.5f, 3.955f, 3.5f, 5.75f)
            reflectiveCurveTo(4.955f, 9f, 6.75f, 9f)
            close()
            moveTo(17f, 6.5f)
            curveTo(17f, 7.88f, 15.88f, 9f, 14.5f, 9f)
            reflectiveCurveTo(12f, 7.88f, 12f, 6.5f)
            reflectiveCurveTo(13.12f, 4f, 14.5f, 4f)
            reflectiveCurveTo(17f, 5.12f, 17f, 6.5f)
            close()
            moveToRelative(-8f, 8f)
            curveToRelative(0f, -1.704f, 0.775f, -3.228f, 1.993f, -4.237f)
            curveTo(10.7f, 10.096f, 10.36f, 10f, 10f, 10f)
            horizontalLineTo(3.5f)
            curveToRelative(-1.105f, 0f, -2f, 0.895f, -2f, 2f)
            curveToRelative(0f, 0f, 0f, 4f, 5.25f, 4f)
            curveToRelative(0.953f, 0f, 1.733f, -0.132f, 2.371f, -0.347f)
            curveTo(9.041f, 15.28f, 9f, 14.895f, 9f, 14.5f)
            close()
            moveToRelative(10f, 0f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            reflectiveCurveTo(10f, 16.985f, 10f, 14.5f)
            reflectiveCurveToRelative(2.015f, -4.5f, 4.5f, -4.5f)
            reflectiveCurveToRelative(4.5f, 2.015f, 4.5f, 4.5f)
            close()
            moveToRelative(-2.146f, -1.854f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            lineTo(13.5f, 15.293f)
            lineToRelative(-0.646f, -0.647f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(1f, 1f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            lineToRelative(3f, -3f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            close()
        }
    }.build()
}
