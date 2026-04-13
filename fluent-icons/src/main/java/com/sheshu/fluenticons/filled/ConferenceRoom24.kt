package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ConferenceRoom24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ConferenceRoom24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.598f, 2.01f)
            lineToRelative(9f, 2f)
            curveTo(19.832f, 4.057f, 20f, 4.262f, 20f, 4.5f)
            verticalLineToRelative(15f)
            curveToRelative(0f, 0.238f, -0.168f, 0.444f, -0.402f, 0.49f)
            lineToRelative(-9f, 2f)
            curveTo(10.288f, 22.053f, 10f, 21.817f, 10f, 21.5f)
            verticalLineToRelative(-19f)
            curveToRelative(0f, -0.315f, 0.289f, -0.552f, 0.598f, -0.49f)
            close()
            moveTo(9f, 4f)
            verticalLineToRelative(16f)
            horizontalLineTo(4.75f)
            curveToRelative(-0.38f, 0f, -0.694f, -0.282f, -0.743f, -0.648f)
            lineTo(4f, 19.25f)
            verticalLineTo(4.75f)
            curveToRelative(0f, -0.38f, 0.282f, -0.693f, 0.648f, -0.743f)
            lineTo(4.75f, 4f)
            horizontalLineTo(9f)
            close()
            moveToRelative(4f, 7f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            curveToRelative(0f, 0.553f, 0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.447f, 1f, -1f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            close()
        }
    }.build()
}
