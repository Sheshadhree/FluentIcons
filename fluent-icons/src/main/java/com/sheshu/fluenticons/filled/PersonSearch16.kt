package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonSearch16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonSearch16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.5f, 8f)
            curveTo(13.328f, 8f, 14f, 8.672f, 14f, 9.5f)
            verticalLineTo(10f)
            curveToRelative(0f, 1.742f, -1.452f, 3.53f, -3.958f, 3.921f)
            lineToRelative(-1.48f, -1.48f)
            curveTo(8.841f, 11.852f, 9f, 11.194f, 9f, 10.5f)
            curveTo(9f, 9.575f, 8.72f, 8.715f, 8.242f, 8f)
            horizontalLineTo(12.5f)
            close()
            moveTo(9f, 1.5f)
            curveToRelative(1.519f, 0f, 2.75f, 1.231f, 2.75f, 2.75f)
            reflectiveCurveTo(10.519f, 7f, 9f, 7f)
            reflectiveCurveTo(6.25f, 5.769f, 6.25f, 4.25f)
            reflectiveCurveTo(7.481f, 1.5f, 9f, 1.5f)
            close()
            moveTo(4.5f, 14f)
            curveToRelative(0.786f, 0f, 1.512f, -0.26f, 2.096f, -0.697f)
            lineToRelative(2.55f, 2.55f)
            curveToRelative(0.196f, 0.196f, 0.512f, 0.196f, 0.707f, 0f)
            curveToRelative(0.196f, -0.195f, 0.196f, -0.511f, 0f, -0.707f)
            lineToRelative(-2.55f, -2.55f)
            curveTo(7.741f, 12.012f, 8f, 11.286f, 8f, 10.5f)
            curveTo(8f, 8.567f, 6.433f, 7f, 4.5f, 7f)
            reflectiveCurveTo(1f, 8.567f, 1f, 10.5f)
            reflectiveCurveTo(2.567f, 14f, 4.5f, 14f)
            close()
            moveToRelative(0f, -1f)
            curveTo(3.12f, 13f, 2f, 11.88f, 2f, 10.5f)
            reflectiveCurveTo(3.12f, 8f, 4.5f, 8f)
            reflectiveCurveTo(7f, 9.12f, 7f, 10.5f)
            reflectiveCurveTo(5.88f, 13f, 4.5f, 13f)
            close()
        }
    }.build()
}
