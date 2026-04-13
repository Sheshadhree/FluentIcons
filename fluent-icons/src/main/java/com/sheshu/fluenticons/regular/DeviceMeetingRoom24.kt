package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.DeviceMeetingRoom24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DeviceMeetingRoom24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.07f, 3f)
            curveTo(5.653f, 3f, 4.422f, 3.97f, 4.091f, 5.346f)
            lineTo(2.1f, 13.619f)
            curveTo(1.563f, 15.852f, 3.255f, 18f, 5.552f, 18f)
            horizontalLineToRelative(12.892f)
            curveToRelative(2.296f, 0f, 3.989f, -2.148f, 3.45f, -4.38f)
            lineToRelative(-1.99f, -8.274f)
            curveTo(19.571f, 3.97f, 18.34f, 3f, 16.925f, 3f)
            horizontalLineTo(7.069f)
            close()
            moveTo(5.55f, 5.697f)
            curveTo(5.72f, 4.995f, 6.347f, 4.5f, 7.07f, 4.5f)
            horizontalLineToRelative(9.856f)
            curveToRelative(0.722f, 0f, 1.35f, 0.495f, 1.519f, 1.197f)
            lineToRelative(1.992f, 8.273f)
            curveToRelative(0.31f, 1.29f, -0.667f, 2.53f, -1.994f, 2.53f)
            horizontalLineTo(5.553f)
            curveToRelative(-1.327f, 0f, -2.304f, -1.24f, -1.993f, -2.53f)
            lineToRelative(1.99f, -8.273f)
            close()
            moveTo(6.748f, 19f)
            curveToRelative(-0.415f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            reflectiveCurveToRelative(0.335f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(10.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(17.662f, 19f, 17.248f, 19f)
            horizontalLineToRelative(-10.5f)
            close()
        }
    }.build()
}
