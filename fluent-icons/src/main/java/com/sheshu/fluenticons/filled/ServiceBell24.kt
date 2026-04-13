package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ServiceBell24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ServiceBell24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 4f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            verticalLineToRelative(1.24f)
            curveToRelative(3.596f, 0.886f, 6.25f, 4.137f, 6.25f, 8.008f)
            curveToRelative(0f, 0.415f, -0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineToRelative(-15f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.335f, -0.75f, -0.75f)
            curveToRelative(0f, -3.86f, 2.668f, -7.098f, 6.25f, -7.999f)
            verticalLineTo(4f)
            close()
            moveToRelative(3.25f, 3.5f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            reflectiveCurveTo(12.836f, 9f, 13.25f, 9f)
            curveToRelative(1.253f, 0f, 2.143f, 0.618f, 2.886f, 1.68f)
            curveToRelative(0.237f, 0.34f, 0.705f, 0.422f, 1.044f, 0.184f)
            curveToRelative(0.34f, -0.237f, 0.422f, -0.705f, 0.184f, -1.044f)
            curveToRelative(-0.93f, -1.33f, -2.228f, -2.32f, -4.114f, -2.32f)
            close()
            moveTo(2f, 17f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(16f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            reflectiveCurveToRelative(-0.895f, 2f, -2f, 2f)
            horizontalLineTo(4f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            close()
        }
    }.build()
}
