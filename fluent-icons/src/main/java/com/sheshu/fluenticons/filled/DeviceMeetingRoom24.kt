package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DeviceMeetingRoom24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DeviceMeetingRoom24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.093f, 5.346f)
            curveTo(4.423f, 3.97f, 5.655f, 3f, 7.07f, 3f)
            horizontalLineToRelative(9.858f)
            curveToRelative(1.416f, 0f, 2.647f, 0.97f, 2.979f, 2.346f)
            lineToRelative(1.992f, 8.273f)
            curveTo(22.437f, 15.852f, 20.745f, 18f, 18.448f, 18f)
            horizontalLineTo(5.552f)
            curveToRelative(-2.297f, 0f, -3.99f, -2.148f, -3.452f, -4.38f)
            lineToRelative(1.993f, -8.274f)
            close()
            moveTo(6.748f, 19f)
            curveToRelative(-0.415f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            reflectiveCurveToRelative(0.335f, 0.75f, 0.75f, 0.75f)
            horizontalLineTo(17.25f)
            curveToRelative(0.415f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(17.666f, 19f, 17.251f, 19f)
            horizontalLineTo(6.75f)
            close()
        }
    }.build()
}
