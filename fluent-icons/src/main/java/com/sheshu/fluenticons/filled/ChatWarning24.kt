package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ChatWarning24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ChatWarning24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22f, 11.998f)
            curveToRelative(0f, -5.523f, -4.477f, -10f, -10f, -10f)
            reflectiveCurveToRelative(-10f, 4.477f, -10f, 10f)
            curveToRelative(0f, 1.643f, 0.397f, 3.23f, 1.145f, 4.65f)
            lineToRelative(-1.116f, 4.289f)
            curveToRelative(-0.037f, 0.14f, -0.037f, 0.288f, 0f, 0.428f)
            curveToRelative(0.118f, 0.454f, 0.582f, 0.727f, 1.036f, 0.608f)
            lineToRelative(4.29f, -1.117f)
            curveToRelative(1.42f, 0.746f, 3.005f, 1.142f, 4.645f, 1.142f)
            curveToRelative(5.523f, 0f, 10f, -4.477f, 10f, -10f)
            close()
            moveTo(12f, 6.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.335f, 0.75f, 0.75f)
            verticalLineToRelative(6.25f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveToRelative(-0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineTo(7.25f)
            curveToRelative(0f, -0.415f, 0.336f, -0.75f, 0.75f, -0.75f)
            close()
            moveToRelative(1f, 9.997f)
            curveToRelative(0f, 0.553f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.447f, -1f, -1f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            close()
        }
    }.build()
}
